package com.multi.mongoDB;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_find {

	public static void main(String[] args) {
		//1. 몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고 db프로그램에 연결 성공");
		
		//2. shop2로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공!");
		
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. memp collection에 연결 성공!");
		
		FindIterable<Document> result =  collection.find(); //전체 검색
		ArrayList<MemoVO> list = new ArrayList<>();
		
		for(Document document : result) {
			//System.out.println(document);
			MemoVO bag = new MemoVO();
			bag.setName(document.getString("name"));
			bag.setAge(document.getInteger("age"));
			bag.setOffice(document.getString("office"));
			bag.setPhone(document.getString("phone"));
			list.add(bag);
		}

		System.out.println("--------------------");
		System.out.println(list);
	}

}
