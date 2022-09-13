package com.hotel.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hotel.dto.QnADTO;
import com.hotel.mapper.QnAMapper;


@Service
public class QnAService {
	QnAMapper qnamapper;
	
	public QnAService(QnAMapper qnamapper) {
		super();
		this.qnamapper = qnamapper;
	}

	public List<QnADTO> selectQna(String email, int pageNo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("email", email);
		map.put("pageNo", pageNo);
		return qnamapper.selectQna(map);
	}

	public int QnaCount(String email) {
		return qnamapper.qnaCount(email);
	}
}
