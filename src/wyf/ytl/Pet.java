package wyf.ytl;

import com.equipment.DefaultPetInfo;
import com.equipment.PetInfo;

public class Pet {
	protected PetInfo petInfo = new DefaultPetInfo();
	
	public PetInfo getPetInfo(){
		return petInfo;
	}
}
