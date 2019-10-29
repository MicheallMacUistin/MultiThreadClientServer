import java.util.Arrays;

//individual block
public class block {
	
	private int priorHash;	//hash of block prior to current block
	private String[] operations;	//list of performed operation
	private int blockHash;	//hash of current block
	
	public block(int priorHash, String[] operations) {	//constructor
		this.priorHash=priorHash;
		this.operations=operations;
		//calculate current hash based on previous operations and block
		Object[] subject = {Arrays.hashCode(operations), priorHash};
		this.blockHash = Arrays.hashCode(subject);
	}
	
	public int getBlockHash() {
		return blockHash;
	}

	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}

	public int getpriorHash() {
		return priorHash;
	}
	
	public String[] getTrans() {
		return operations;
	}	
}
