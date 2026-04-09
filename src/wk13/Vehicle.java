package wk13;

public abstract class Vehicle implements License{

        private int numWheels;
        private String motorType = "v1";
        private double speed;
        private boolean engineRunning;
        private String licenseType;
        private boolean hasValidLicense;

        public Vehicle(String motorType, int numWheels) {
            setMotorType(motorType);
            setNumWheels(numWheels);
        }
        @Override
        public String getLicenseType() {
            return licenseType;
        }
        public void setLicenseType(String licenseType) {
            this.licenseType = licenseType;
        }
        @Override
        public boolean isLicenseSuspended(){
            return !hasValidLicense;
        }


        public abstract void moving(String direction);
        public void turnOn(){
            engineRunning = true;
        }

        public void turnOff(){
            engineRunning = false;
        }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
            if(numWheels < 2 || numWheels > 4)
                throw new IllegalArgumentException("numWheels must be between 2 and 4");

        this.numWheels = numWheels;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
            if(speed < 0 || speed > 300)
                throw new IllegalArgumentException("speed must be between 0 and 300");
        this.speed = speed;
    }

}
