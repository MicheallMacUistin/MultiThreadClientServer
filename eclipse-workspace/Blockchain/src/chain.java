import java.util.ArrayList;

public class chain {
	
	//arraylist of blocks
	ArrayList<block> blockchain = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//creating the genesis block
		String[] genesisOperation = {"21 bitcoin", "0 bitcoin"};
		block genesis = new block(0, genesisOperation);
		
		//creating a second block
		String[] secondBlockOperation = {"2 bitcoin", "1 bitcoin"};
		block secondBlock = new block(genesis.getBlockHash(), secondBlockOperation);
		
		//print the hash/digital signature of block
		System.out.println("Digital signature of genesis");
		System.out.println(genesis.getBlockHash());
		System.out.println("Digital signature of secondBlock");
		System.out.println(secondBlock.getBlockHash());
	}

}
