class ArrayTest{
    public static void main(String args[]){
int twoD[][] = new int[4][5];
        int k = 0;

        // 1. تعبئة المصفوفة بأرقام من 0 لـ 19
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        // 2. طباعة المصفوفة على شكل جدول (صفوف وأعمدة)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + "\t");
            }
            System.out.println(); // سطر جديد بعد كل صف
        }

    }
}