package vehicles;

public class Tank extends Ground{

	private int[] color;
	private double length;
	private double leftTreadSpeed;
	private double rightTreadSpeed;
	
	public Tank() {
		super(DriveType.Tread, NumDrive.TwoWheel);
	}
	
	public void drive(double speed, double angle) {
		
	}
	
	public void arcadeDrive(double forward, double angle) {
		
	}
	
	public void steeringWheelDrive(double forward, double angle) {
	}
	
	public void tankDrive(double l, double r) {
		leftTreadSpeed = l;
		rightTreadSpeed = r;
	}

	public int[] getColor() {
		return color;
	}

	public void setColor(int[] color) {
		this.color = color;
	}
}
