package vehicles;

public class Car extends Ground{
	public Car(){
		super(DriveType.Steer, NumDrive.FourWheel);
	}
	public void arcadeDrive(double forward, double angle) {
		setAngle(angle);
		setSpeed(forward);
	}
	public void tankDrive(double l, double r) {
	}

	
	public void steeringWheelDrive(double forward, double angle) {
			
	}

	public void drive(double speed, double angle) {
		// TODO Auto-generated method stub
		
	}
}
