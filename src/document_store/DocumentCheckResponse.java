package document_store;

public class DocumentCheckResponse {

	boolean checksumExists;
	String idOfDuplicatedDocument;

	public boolean isChecksumExists() {
		return checksumExists;
	}

	public void setChecksumExists(boolean checksumExists) {
		this.checksumExists = checksumExists;
	}

	public String getIdOfDuplicatedDocument() {
		return idOfDuplicatedDocument;
	}

	public void setIdOfDuplicatedDocument(String idOfDuplicatedDocument) {
		this.idOfDuplicatedDocument = idOfDuplicatedDocument;
	}
}
