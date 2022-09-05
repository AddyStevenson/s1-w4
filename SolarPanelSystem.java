public class SolarPanelSystem{
    private double totalUsage;
    private double currentCharge;
    private double batteryLifeHours = 100;

    public SolarPanelSystem(double totalUsage, double currentCharge) {
        this.totalUsage = totalUsage;
        this.currentCharge = currentCharge;
    }

    public void sunShinning(double intensity, double duration){
        this.currentCharge += intensity * duration / 30;
    }

    public void powerUse(double watts, double duration){
        double power = watts * duration;
        this.currentCharge -= power;
        this.increaseTotalUsage(power);
        this.batteryDeterioration(10);
    }

    public void increaseTotalUsage(double use){
        this.totalUsage += use;
    }

    public void batteryDeterioration(int hoursOnBattery){
        this.batteryLifeHours -= hoursOnBattery / 6;
    }

    public double getTotalUsage() {
        return totalUsage;
    }

    public void setTotalUsage(double totalUsage) {
        this.totalUsage = totalUsage;
    }

    public double getCurrentCharge() {
        return currentCharge;
    }

    public double getBatteryLifeHours() {
        return batteryLifeHours;
    }
}