package istarmodel1.services;

import java.util.List;
import istarmodel1.*;

public class RoleValidation {

	public boolean hasNoSelfloop(GoalTaskElement element){

		List<GoalTaskElement> refinement;
		
		if(element.getOrRefinement().size()>0){
			refinement = element.getOrRefinement();
		}
		else {
			refinement = element.getAndRefinement();
		}
		
		for(GoalTaskElement current: refinement){
			if(current==element) return false;
		}
		
		return true;
	}
	
	public boolean isCirclefree(GoalTaskElement element){
		
		List<GoalTaskElement> refinement;
		List<GoalTaskElement> currentRefinement;
		
		if(element.getOrRefinement().size()>0){
			refinement = element.getOrRefinement();
		}
		else {
			refinement = element.getAndRefinement();
		}
		
		for(GoalTaskElement current: refinement){
			if(current.getOrRefinement().size()>0){
				currentRefinement = current.getOrRefinement();
			}
			else {
				currentRefinement = current.getAndRefinement();
			}
			for(GoalTaskElement iselement: currentRefinement){
				if(iselement==element) return false;
			}
		}
		
		return true;
	}
}
