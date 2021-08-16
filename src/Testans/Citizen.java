package Testans;

public class Citizen {
    public void personAge(int[] age) {
        int minorCount = 0;
        int adultCount = 0;
        int seniorCitizenCount = 0;

        for (int i = 0; i < age.length; i++) {
            if (age[i] < 18)
                minorCount++;
            if (age[i] >= 18 && age[i] <= 59)
                adultCount++;
            if (age[i] >= 60)
                seniorCitizenCount++;
        }
        System.out.println(" Minor : " + minorCount + " \n " + "Adult : " + adultCount + " \n " + "Senior Citizen : " + seniorCitizenCount);
    }
}
