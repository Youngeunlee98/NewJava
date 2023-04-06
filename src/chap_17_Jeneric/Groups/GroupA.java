package chap_17_Jeneric.Groups;

import java.util.HashMap;
import java.util.Map;

public class GroupA implements GroupsInterface{
    private Map<String,String> memMap = new HashMap<String,String>();

    public Map<String, String> getMemMap() {
        return memMap;
    }

    public void setMemMap(Map<String, String> memMap) {
        this.memMap = memMap;
    }

    public GroupA(){
        this.memMap.put("","");



    }


}
