package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDB_shop2_updateMany {

	public static void main(String[] args) {
		//1. 몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고 db프로그램에 연결 성공");
		
		//2. shop2로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공!");
		
		//3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. memo collection에 연결 성공!");
	
		//update할 조건은 json(document로 만들어주기)
		Document filter = new Document();
		filter.append("office", "busan");
		
		//update할 내용을 bson(json) 만들어주기
		Bson set = Updates.set("phone", "9999");
		Bson set2 = Updates.set("name", "songsong2");
		Bson set3 = Updates.set("age", 555);
		
		List<Bson> list = new ArrayList<Bson>();
		list.add(set);
		list.add(set2);
		list.add(set3);
		
		Bson sets = Updates.combine(list);
		collection.updateMany(filter, sets);
		System.out.println("4. memo collection에 updateOne 성공!");
		
	}

}
