package istarmodel1.services;

import java.util.Map;
import java.util.HashMap;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.ISaveablePart2;
import org.eclipse.sirius.common.ui.tools.api.util.ISaveDialogExtension;


public class CustomSaveDialog implements ISaveDialogExtension{
	
		public CustomSaveDialog(){}
	
		@Override
	    public boolean isSaveDialogFor(Object objectToSave) {
	        // This save dialog is active if
	        // - the saved element is a session
	        return (objectToSave instanceof Session)
	        // - the session ID is "SaveSession"
	                && "SaveSession".equals(((Session) objectToSave).getID());
	    }

		@Override
	    public  Map<String, Integer> getButtons(boolean stillOpenElsewhere) {
	    	HashMap<String, Integer> buttons= new HashMap<String, Integer>();
	    	buttons.put("Save", 0);
	    	buttons.put("Special", 1);
	    	buttons.put("Discard", 2);
	        return buttons;
	    }

		@Override
	    public int reactToValue(Object objectToSave, int temporaryResult, boolean stillOpenElsewhere) {
	        Session session = (Session) objectToSave;
	        int returnedValue = ISaveablePart2.YES;

	        switch (temporaryResult) {
	        // Case 0 : "Save"
	        case 0:
	            // we will return ISaveablePart2.YES => the session will be saved
	            // normally
	            break;
	        // Case 1 : "Make something special"
	        case 1:
	            //makeSomethingSpecial(session);
	            // we will return CANCEL => nothing else will be done
	            returnedValue = ISaveablePart2.CANCEL;
	            break;
	        // Case 2 : "Discard"
	        case 2:
	            // we return NO => changes will be discarded
	            returnedValue = ISaveablePart2.NO;
	            break;
	        // Default : "CANCEL" or any other
	        default:
	            returnedValue = ISaveablePart2.CANCEL;
	            break;

	        }
	        return returnedValue;
	    }
	
}
