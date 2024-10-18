
public class Car {

    private String Carname;
    private String CarModel;
    private String CarColor;
    private int WhellNo;

    public Car(String Name, String CarModel, String CarColor, int WhellNo) {
        this.Carname = Name;
        this.CarModel = CarModel;
        this.CarColor = CarColor;
        this.WhellNo = WhellNo;

    }

    public Car() {

    }

    public String MakeCarwithColor() {

        return "Car Is created with color--+" + this.CarColor;
    }

   //create properties
   public String getCarname() {
    return Carname;
   }
   public  void setCarname(String Carname) {
    this.Carname = Carname;
   }
   public String getCarModel() {
    return  CarModel;


   }
   public  void setCarModel(String CarModel) {
    this.CarModel = CarModel;
   }
   public  String getCarColor() {
    return this.CarColor;
   }
   public void setCarColor(String CarColor) {
    this.CarColor = CarColor;
   }
   public int getWhellNo() {
    return WhellNo;
   }
  public  void setWhellNo(int WhellNo) {
    this.WhellNo = WhellNo;
  }





}
