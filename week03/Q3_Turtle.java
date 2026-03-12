public class Q3_Turtle {
    // i. 已經宣告好的屬性
    String species;
    int age;

    // ii. 撰寫建構子 (Constructor)
    // 注意：建構子的名稱必須與類別名稱完全相同，且沒有回傳值型態 (連 void 都不用寫)
    public Q3_Turtle(String species, int age) {
        // 使用 this 關鍵字來區分「類別的屬性」與「傳入的參數」
        this.species = species;
        this.age = age;
    }

    // 題目 iv 提到的 showDetails 方法
    public void showDetails() {
        System.out.println("品種：" + species + "，年紀：" + age + "歲");
    }

    public static void main(String[] args) {
        // iii. 呼叫建構子，直接在括號內傳入參數，一行搞定實例化與賦值
        Q3_Turtle myTurtle = new Q3_Turtle("綠蠵龜", 50);

        // iv. 呼叫 showDetails() 方法印出資訊
        myTurtle.showDetails();
    }
}