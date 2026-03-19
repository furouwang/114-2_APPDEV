// 父類別
class MarineLife {
    protected String name;
    protected String habitat;

    public MarineLife(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String info() {
        return name + "，棲息地：" + habitat;
    }

    public String move() {
        return name + " 在水中移動";
    }
}

// TODO 1: Fish 繼承 MarineLife
class Fish extends MarineLife {
    private String scaleColor; // 新增屬性 scaleColor

    // 建構子接收 name, habitat, scaleColor
    public Fish(String name, String habitat, String scaleColor) {
        super(name, habitat); // 用 super 呼叫父類別建構子
        this.scaleColor = scaleColor;
    }

    // 覆寫 move()
    @Override
    public String move() {
        return name + " 擺動魚鰭游泳";
    }

    // 新增方法 fishInfo()
    public String fishInfo() {
        return info() + " 鱗片：" + scaleColor; // 呼叫父類別的 info()
    }
}

// TODO 2: Whale 繼承 MarineLife
class Whale extends MarineLife {
    private double length; // 新增屬性 length

    // 建構子接收 name, habitat, length
    public Whale(String name, String habitat, double length) {
        super(name, habitat); // 用 super 呼叫父類別建構子
        this.length = length;
    }

    // 覆寫 move()
    @Override
    public String move() {
        return name + " 擺動尾鰭前進";
    }

    // 新增方法 whaleInfo()
    public String whaleInfo() {
        return info() + " 體長：" + length + " 公尺"; // 呼叫父類別的 info()
    }
}

// 主程式類別 (檔名請設為 MarineLifeDemo.java)
 class MarineLifeDemo {
    public static void main(String[] args) {
        // TODO 3: 建立 Fish 和 Whale 各一個
        Fish clownfish = new Fish("小丑魚", "珊瑚礁", "橘白相間");
        Whale blueWhale = new Whale("藍鯨", "太平洋", 30.0);

        // 印出 fishInfo() / whaleInfo() 和 move()
        System.out.println(clownfish.fishInfo());
        System.out.println(clownfish.move());
        
        System.out.println(blueWhale.whaleInfo());
        System.out.println(blueWhale.move());
    }
}
