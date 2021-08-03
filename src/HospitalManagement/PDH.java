package HospitalManagement;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ObjectMainMethod {
    private static Map <Long,Hospital> hospitalMap;

    private static Map<Long,Doctor> doctorMap;
    private static Doctor doctorSurya;
    private static Doctor doctorRamesh;
    private static Doctor doctorGuru;
    private static Doctor doctorDeepa;

    private static Map<Long,Patient> patientMap;
    private static Patient patientSivahari;
    private static Patient patientChandhra;
    private static Patient patientLaxmi;
    private static Patient patientBadsha;
    private static Patient patientMuthu;

    static {

        hospitalMap = new HashMap<>();
        Hospital hospital = new Hospital();
        hospital.setHospitalName("Frontline Hospital");
        hospital.setHospitalID(0001l);
        hospital.setHospitalLocation("Chennai");
        hospitalMap.put(0001l, hospital);


        doctorMap = new HashMap<>();
        doctorSurya = new Doctor();
        doctorSurya.setDoctorName("Dr. SivaSurya");
        doctorSurya.setDoctorID(0001l);
        doctorSurya.setSpecialisation("Cardialogy");

        doctorRamesh = new Doctor();
        doctorRamesh.setDoctorName("Dr. RameshNatarajan");
        doctorRamesh.setDoctorID(0002l);
        doctorRamesh.setSpecialisation("Orthopedics");

        doctorGuru = new Doctor();
        doctorGuru.setDoctorName("Dr. Gurunathan");
        doctorGuru.setDoctorID(0003l);
        doctorGuru.setSpecialisation("Dermatalogist");

        doctorDeepa = new Doctor();
        doctorDeepa.setDoctorName("Dr. Deepa");
        doctorDeepa.setDoctorID(0004l);
        doctorDeepa.setSpecialisation("Otolaryngologist.");

        doctorMap.put(0001l, doctorSurya);
        doctorMap.put(0002l, doctorRamesh);
        doctorMap.put(0003l, doctorGuru);
        doctorMap.put(0004l, doctorDeepa);

        patientMap = new HashMap<>();
        patientSivahari = new Patient();
        patientSivahari.setPatientName("Sivahari");
        patientSivahari.setPatientID(101l);
        patientSivahari.setPatientDOB(new Date(2001,12,11));
        patientSivahari.setPhoneNumber("9452154268");
        patientSivahari.setTypeIpOp("OutPatient");

        patientChandhra = new Patient();
        patientChandhra.setPatientName("Chandhra");
        patientChandhra.setPatientID(102l);
        patientChandhra.setPatientDOB(new Date(1999,02,01));
        patientChandhra.setPhoneNumber("7397511890");
        patientChandhra.setTypeIpOp("OutPatient");

        patientLaxmi = new Patient();
        patientLaxmi.setPatientName("Laxmi");
        patientLaxmi.setPatientID(103l);
        patientLaxmi.setPatientDOB(new Date(1997,11,10));
        patientLaxmi.setPhoneNumber("7505545896");
        patientLaxmi.setTypeIpOp("OutPatient");

        patientBadsha = new Patient();
        patientBadsha.setPatientName("Badsha");
        patientBadsha.setPatientID(104l);
        patientBadsha.setPatientDOB(new Date(2002,01,20));
        patientBadsha.setPhoneNumber("8524596210");
        patientBadsha.setTypeIpOp("OutPatient");

        patientMuthu = new Patient();
        patientMuthu.setPatientName("Muthu");
        patientMuthu.setPatientID(105l);
        patientMuthu.setPatientDOB(new Date(1985,12,15));
        patientMuthu.setPhoneNumber("9442346964");
        patientMuthu.setTypeIpOp("OutPatient");

        patientMap.put(101l, patientSivahari);
        patientMap.put(102l, patientChandhra);
        patientMap.put(103l, patientLaxmi);
        patientMap.put(104l, patientBadsha);
        patientMap.put(105l, patientMuthu);

    }

}
