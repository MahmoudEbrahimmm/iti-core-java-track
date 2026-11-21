class ArrayTest{
    public static void main(String args[]){
        int month = 4;
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "writer";
        }
        else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        }
        else if (month == 6 || month == 7 || month == 8) {
            season = "summer";
        }
        else if (month == 10 || month == 11 || month == 12) {
            season = "Autumn";
        }
        else{
            season = "Unknown Month";
        }

        System.out.println("April is in th " + season + ".");

    }
}