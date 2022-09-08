package com.hotel;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.hotel.dto.HotelDTO;
import com.hotel.service.HotelService;
import com.hotel.service.RoomService;

@Controller
public class AdminController {
	private HotelService hotelservice;
	private RoomService roomservice;
	
	public AdminController(HotelService hotelservice, RoomService roomservice) {
		super();
		this.hotelservice = hotelservice;
		this.roomservice = roomservice;
	}

	@RequestMapping("/admin.do")
	public String main(Model model) {
		model.addAttribute("title", "메인 페이지");
		model.addAttribute("page", "mainView.jsp" );
		
		return "es/admin_main";
	}
	
	@RequestMapping("/selectAllHotel.do")
	public String selectAllHotel(Model model) {
		List<HotelDTO> list = hotelservice.selectAllHotel();
		
		// 정보확인
		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).toString());
			String tel = list.get(i).getHotelTel();
			if(tel.length() == 8){
				list.get(i).setHotelTel(tel.replaceFirst("^([0-9]{4})([0-9]{4})$", "$1-$2"));
			}
			else if(tel.length()==12) {
				list.get(i).setHotelTel(tel.replaceFirst("(^[0-9]{4})([0-9]{4})([0-9]{4})$","$1-$2-$3"));
			}else{
			list.get(i).setHotelTel(tel.replaceFirst("(^02|[0-9]{3})([0-9]{3,4})([0-9]{4})$","$1-$2-$3"));
			}
		}
		
		model.addAttribute("title", "전체 지점 관리");
		model.addAttribute("page", "allHotelView.jsp" );
		model.addAttribute("list", list);
		
		return "es/admin_main";
	}
	
	@RequestMapping("/insertHotelView.do")
	public String insertHotelView(Model model) {
		
		model.addAttribute("title", "호텔 지점 등록");
		model.addAttribute("page", "insertHotelView.jsp" );
		
		return "es/admin_main";
	}
	
	@RequestMapping("/insertHotel.do")
	public String insertHotel(HotelDTO dto, String addr1, String addr2, String addr3,
			Model model, MultipartHttpServletRequest request
			) throws IOException{
		
		/////////////////////////////// 파일 업로드 부 ////////////////////////////////

		File userRoot = new File("C:\\Hotel\\hotel_project\\HotelProject\\src\\main\\webapp\\admin_resource\\images\\");
		String encoding = "utf-8";
		
		if(!userRoot.exists())
			userRoot.mkdirs();
		
		List<MultipartFile> filelist = request.getFiles("file");
		int i = 1;
		for(MultipartFile f : filelist) {
			String originalFileName = f.getOriginalFilename();
			if(f.getSize() == 0) continue;
			File uploadFile = new File("C:\\Hotel\\hotel_project\\HotelProject\\src\\main\\webapp\\admin_resource\\images\\" + "\\" +originalFileName);
			System.out.println(originalFileName);
			dto.setHotelImage(dto.getHotelImage()+ originalFileName);
			i++;
			try {
				//실제로 전송
				f.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/////////////////////////////// 파일 업로드 부 ////////////////////////////////

		String hotelAddress = addr1 + "/" + addr2 + "/" + addr3;
		
		dto.setHotelTel(dto.getHotelTel().replaceAll("-", ""));
		dto.setHotelAddress(hotelAddress);
			
//		System.out.println(dto.toString());
			
		int result = 0;
		System.out.println(result+"llll");
		result = hotelservice.insertHotel(dto);
		System.out.println(result);
		
		
		model.addAttribute("title", "전체 지점 관리");
		model.addAttribute("page", "allHotelView.jsp");
		model.addAttribute("result", result);
		
		return "es/admin_main";
	}
	
	
	@RequestMapping("/hotelUpdateView.do")
	public String updateHotelView(String hotelNo, Model model) {
		
//		System.out.println("updateHotelView : " + hotelNo);
		
		HotelDTO dto = hotelservice.selectOneHotel(hotelNo);
		
		String address[] = dto.getHotelAddress().split("/");
//		System.out.println(address[0]);
//		System.out.println(address[1]);
//		System.out.println(address[2]);
		
//		System.out.println("hotle Update View : " + dto.toString());
		
		model.addAttribute("title", "전체 지점 관리");
		model.addAttribute("page", "updateHotelView.jsp");
		model.addAttribute("dto", dto);
		model.addAttribute("address", address);
		
		return "es/admin_main";
	}
	
	@RequestMapping("/hotelUpdate.do")
	public String updateHotel(HotelDTO dto, String addr1, String addr2, String addr3,
			Model model, MultipartHttpServletRequest request, HttpServletResponse response) throws IOException {

		/////////////////////////////// 파일 업로드 부 ////////////////////////////////

		File userRoot = new File("C:\\Hotel\\hotel_project\\HotelProject\\src\\main\\webapp\\admin_resource\\images\\");
		String encoding = "utf-8";
		
		if(!userRoot.exists())
			userRoot.mkdirs();
		
		List<MultipartFile> filelist = request.getFiles("file");
		int i = 1;
		for(MultipartFile f : filelist) {
			String originalFileName = f.getOriginalFilename();
			if(f.getSize() == 0) continue;
			File uploadFile = new File("C:\\Hotel\\hotel_project\\HotelProject\\src\\main\\webapp\\admin_resource\\images\\" + "\\" +originalFileName);
//			System.out.println(originalFileName);
			dto.setHotelImage(dto.getHotelImage()+ originalFileName);
			i++;
			try {
				//실제로 전송
				f.transferTo(uploadFile);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/////////////////////////////// 파일 업로드 부 ////////////////////////////////

		String hotelAddress = addr1 + "/" + addr2 + "/" + addr3;
			
		dto.setHotelAddress(hotelAddress);
		dto.setHotelTel(dto.getHotelTel().replaceAll("-", ""));
		
//		System.out.println(dto.toString());
			
		int result = hotelservice.updateHotel(dto);
		System.out.println(result);
		if(result==1) {
			PrintWriter pw = response.getWriter();
			pw.println("<script>alert('호텔 정보가 정상적으로 수정되었습니다.'); </script>");
			pw.flush();
		}
		
		
		model.addAttribute("title", "전체 지점 관리");
		model.addAttribute("page", "allHotelView.jsp");
		

		return "redirect:/selectAllHotel.do";
	}
	
	@RequestMapping("/deleteHotel.do")
	public String deleteHotel(String hotelNo, Model model) {
		
		return "redirect:/selectAllHotel.do";
	}

	
}








