public class Worker {

    private static int count = 0;

    private int id;
    private String name;
    private int income;
    private int bonusPay;
    private int wph;// Wage per our
    private int qwt;// Quarter wage tax
    private int qei;// Quarter Extra income
    private int qet;// Quarter Extra tax
    private int tqt;// Total Quarter tax

    ////////// Constructors //////////
    public Worker(String name)
    {
        Worker.count = Worker.count + 1;
        setName(name);
        setId(Worker.count);
    }

    public void printFunction(int dtype){
        switch (dtype){
            case 1:
                System.out.println(this.getName() + " wage = " + this.getWph()); break;
            case 2:
                System.out.println(this.getName() + " bonusPay = " + this.getBonusPay()); break;
            case 3:
                System.out.println(this.getName() + " income = " + this.getIncome()); break;
            default:
                System.err.println("Invalid datatype id");
        }
    }
    ////////// Getters and Setters ///////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getWph() {
        return wph;
    }

    public void setWph(int wph) {
        this.wph = wph;
    }

    public int getQwt() {
        return qwt;
    }

    public void setQwt(int qwt) {
        this.qwt = qwt;
    }

    public int getQei() {
        return qei;
    }

    public void setQei(int qei) {
        this.qei = qei;
    }

    public int getQet() {
        return qet;
    }

    public void setQet(int qet) {
        this.qet = qet;
    }

    public int getTqt() {
        return tqt;
    }

    public void setTqt(int tqt) {
        this.tqt = tqt;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getBonusPay() {
        return bonusPay;
    }

    public void setBonusPay(int bonusPay) {
        this.bonusPay = bonusPay;
    }
}
