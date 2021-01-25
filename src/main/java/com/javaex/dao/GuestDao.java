package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestVo;

@Repository
public class GuestDao {
	
	@Autowired
	private SqlSession sqlSession;

	
	// DB에서 리스트 가져오기
	
	public List<GuestVo> getList(){
		
		List<GuestVo> guList = sqlSession.selectList("guestbook.selectList");
		
		return guList;

	}
	
	//DB에서 삭제
	public int delete(GuestVo guVo){
			
		int result = sqlSession.delete("guestbook.delete", guVo);
		
		return result;
	}
	
	
	
	//DB 등록
	public void insert(GuestVo guVo){
		
		sqlSession.insert("guestbook.insert", guVo);
		
		
	}
	
	
	
	//DB에서 데이터 하나 가져오기
	public GuestVo getOne(int no){
		
		GuestVo guVo = sqlSession.selectOne("guestbook.selectOne", no);
		return guVo;
	}
	

	
	
	
	//DB 수정
	public void update(GuestVo guVo){
		
		System.out.println(sqlSession.update("guestbook.update", guVo));

	}
	
	

	
	   

	
	
	
	

	
}
