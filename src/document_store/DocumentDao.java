package document_store;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DocumentDao {

	MongoClient mongoClient = new MongoClient();
	MongoDatabase database = mongoClient.getDatabase("Documents");
	MongoCollection<Document> collection = database.getCollection("Docs");

	public Document getDocumentByChecksum(String checksum) {
		Document document = collection.find(Filters.eq("Checksum", checksum)).first();
		return document;
	}

}