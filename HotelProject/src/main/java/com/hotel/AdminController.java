package com.hotel;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.hotel.dto.HotelDTO;
import com.hotel.dto.MemberDTO;
import com.hotel.dto.QnADTO;
import com.hotel.dto.RoomDTO;
import com.hotel.service.HotelService;
import com.hotel.service.MemberService;
import com.hotel.service.QnAService;
import com.hotel.service.RoomService;
import com.hotel.vo.PaggingVO;

@Controller
public class AdminController {
	private HotelService hotelservice;
	private RoomService roomservice;
	private MemberService memberservice;
	private QnAService qnaservice;
	
	public AdminController(HotelService hotelservice, RoomService roomservice, MemberService memberservice,
			QnAService qnaservice ) {
		super();
		this.hotelservice = hotelservice;
		this.roomservice = roomservice;
		this.memberservice = memberservice;
		this.qnaservice = qnaservice;
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
			// 전화번호 형식 변환부
			String tel = list.get(i).getHotelTel();
			if(tel.length() == 8){
				list.get(i).setHotelTel(tel.replaceFirst("^([0-9]{4})([0-9]{4})$", "$1-$2"));
			}
			else if(tel.length()==12) {
				list.get(i).setHotelTel(tel.replaceFirst("(^[0-9]{4})([0-9]{4})([0-9]{4})$","$1-$2-$3"));
			}else{
			list.get(i).setHotelTel(tel.replaceFirst("(^02|[0-9]{3})([0-9]{3,4})([0-9]{4})$","$1-$2-$3"));
			}
			
			// 호텔 전체 객실 개수 구하는 부분
			int allEa = hotelservice.selectAllEa(list.get(i).getHotelNo());
			list.get(i).setHotelAllRoomEA(allEa);
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
	
	
	@RequestMapping("/updateHotelView.do")
	public String updateHotelView(String hotelNo, Model model) {
		
		HotelDTO dto = hotelservice.selectOneHotel(hotelNo);
		
		String address[] = dto.getHotelAddress().split("/");
		
		model.addAttribute("title", "전체 지점 관리");
		model.addAttribute("page", "updateHotelView.jsp");
		model.addAttribute("dto", dto);
		model.addAttribute("address", address);
		
		return "es/admin_main";
	}
	
	@RequestMapping("/updateHotel.do")
	public String updateHotel(HotelDTO dto, String addr1, String addr2, String addr3,
			Model model, MultipartHttpServletRequest request) throws IOException {
		System.out.println("hotel update test : " + dto.getHotelNo());
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
			
		dto.setHotelAddress(hotelAddress);
		dto.setHotelTel(dto.getHotelTel().replaceAll("-", ""));
		
		System.out.println("update test : ");
		System.out.println(dto.toString());
			
		int result = hotelservice.updateHotel(dto);
		System.out.println(result);

		return "redirect:/selectAllHotel.do";
	}
	
	@RequestMapping("/deleteHotel.do")
	public String deleteHotel(String hotelNo, Model model) {
		System.out.println(hotelNo);
		int result = hotelservice.deleteHotel(hotelNo);
		
		
		return "redirect:/selectAllHotel.do";
	}
////////////////////////////////////////////// MEMBER / QNA 부 /////////////////////////////
	@RequestMapping("/selectAllMember.do")
	public String selectAllMember(Model model) {
		List<MemberDTO> list = memberservice.selectAllMember();
		model.addAttribute("list", list);
		model.addAttribute("title", "전체 회원 관리");
		model.addAttribute("page", "memberList.jsp" );
		return "es/admin_main";
	}
	
	@RequestMapping("/memberProfile.do")
	public String memberProfile(@RequestParam(name = "pageNo", defaultValue = "1") int pageNo, String email, Model model) {
		if(email == null) 
			email = "test00";
		MemberDTO member = memberservice.selectMember(email);
		String date = member.getBirth();
		member.setBirth(date.substring(0, 10));
		
		List<QnADTO> qna = qnaservice.selectQna(email, pageNo);
		int count = qnaservice.QnaCount(email);
		PaggingVO vo = new PaggingVO(count, pageNo, 5 ,5);
		
		model.addAttribute("pagging", vo);
		model.addAttribute("dto", member);
		model.addAttribute("qna", qna);
		model.addAttribute("title", "회원 프로필");
		model.addAttribute("page", "memberProfile.jsp" );
		return "es/admin_main";
	}
	
	@RequestMapping("/updateQnaResponse.do")
	public String updateQnaResponse(String qnano, String response, String email) {
		System.out.println("qna : " + qnano + ", " + "response : " + response);		
		int result = qnaservice.updateQnaResponse(qnano, response);
		
		return "redirect:/memberProfile.do?email="+email;
	}
	
	@RequestMapping("/deleteQnaResponse.do")
	public String deleteQnaResponse(String qnano, String email) {
		int result = qnaservice.deleteQnaResponse(qnano);
		
		return "redirect:/memberProfile.do?email="+email;
	}
	
	@RequestMapping("/memberUpdate.do")
	public void memberUpdate(MemberDTO dto, HttpServletResponse response, HttpServletRequest request) 
			throws IOException {
		System.out.println(dto.toString());
		
		dto.setBirth(dto.getBirth().replaceAll("-", "/").substring(2, 10));
		
		if(dto.getGender().equals("남성"))
			dto.setGender("M");
		else
			dto.setGender("F");
		boolean flag = false;
		int result = memberservice.updateMember(dto);
		response.setContentType("text/html;charset=utf-8");
		if(result == 1)
			response.getWriter().write(
					"<script>alert('수정이 완료되었습니다.');location.href='memberProfile.do?email="+dto.getEmail()+"';</script>");
		else
			response.getWriter().write(
					"<script>alert('수정에 실패하였습니다.');</script>");
	}
	
	@RequestMapping("/memberDelete.do")
	public void memberDelete(String email, HttpServletResponse response) throws IOException {
		int result = memberservice.deleteMember(email);
		response.getWriter().write(String.valueOf(result));
	}
	
	@RequestMapping("/memberSearch.do")
	public ResponseEntity<List<MemberDTO>> memberSearch(String kind, String search) {
		List<MemberDTO> list = memberservice.searchMember(kind, search);
		return ResponseEntity.ok(list);
	}
	
	@RequestMapping("/selectAllRoom.do")
	public String selectAllRoom(Model model) {
		List<RoomDTO> list = roomservice.selectAllRoom();
		
		// 정보확인
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
			
			List<RoomDTO> optionlist = roomservice.selectRoomOption(list.get(i).getRoomNo());
			String hotelName = roomservice.selectHotelName(list.get(i).getHotelNo());
			list.get(i).setHotelName(hotelName);
			list.get(i).setOptionlist(optionlist);
		}
		
		model.addAttribute("title", "전체 객실 관리");
		model.addAttribute("page", "allRoomView.jsp" );
		model.addAttribute("list", list);
		
		return "es/admin_main";
	}
	
	@RequestMapping("/updateRoomView.do")
	public String updateRoomView(String roomNo, Model model) {
		
		RoomDTO dto = roomservice.selectOneRoom(roomNo);
		
		List<RoomDTO> hotellist = roomservice.selectHotelList();
		dto.setHotellist(hotellist);
		
		model.addAttribute("title", "전체 객실 관리");
		model.addAttribute("page", "updateRoomView.jsp");
		model.addAttribute("dto", dto);
		
		return "es/admin_main";
	}
	
	@RequestMapping("/updateRoom.do")
	public String updateRoom(HotelDTO dto, String addr1, String addr2, String addr3,
			Model model, MultipartHttpServletRequest request) throws IOException {
		System.out.println("hotel update test : " + dto.getHotelNo());
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
			
		dto.setHotelAddress(hotelAddress);
		dto.setHotelTel(dto.getHotelTel().replaceAll("-", ""));
		
		System.out.println("update test : ");
		System.out.println(dto.toString());
			
		int result = hotelservice.updateHotel(dto);
		System.out.println(result);

		return "redirect:/selectAllHotel.do";
	}
}








