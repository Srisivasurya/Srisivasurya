package HospitalManagement;


import java.util.*;

class GenerateVId {

    static public Long getVisitId(ArrayList<Long> visitId) {

        Collections.sort(visitId);
        Long l = (new Long(visitId.size()));
        l++;
        return l++;
    }

}
