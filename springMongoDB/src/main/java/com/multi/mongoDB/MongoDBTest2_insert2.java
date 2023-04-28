package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_insert2 {

	public static void main(String[] args) {
		// 1. 몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고 db프로그램에 연결 성공");

		// 2. shop2로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공!");

		// 3. member 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3. member collection에 연결 성공!");

		Document doc = new Document();
		doc.append("id", "friday");
		doc.append("pw", "friday");
		doc.append("name", "friday");
		doc.append("tel", "friday");
		
		Document doc2 = new Document();
		doc2.append("id", "friday2");
		doc2.append("pw", "friday2");
		doc2.append("name", "friday2");
		doc2.append("tel", "friday2");


		List<Document> list = new ArrayList<Document>();
		list.add(doc);
		list.add(doc2);
		
		collection.insertMany(list);
		System.out.println("4. member collection에 insertOne 성공!");

	}

}
