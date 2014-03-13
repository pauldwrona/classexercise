package vehicles;

import vehicles.Ground.DriveType;
import vehicles.Ground.NumDrive;

public abstract class Ground extends Vehicle {
	public enum DriveType {
		Steer, Tread
	};
	public enum NumDrive {
		FourWheel, TwoWheel
	};
	private DriveType drivetype;
	private NumDrive numdrive;
	private double speed, angle;
	public Ground(DriveType drivetype, NumDrive numdrive) {
		this.drivetype = drivetype;
		this.numdrive = numdrive;
	}
	public abstract void arcadeDrive(double forward, double angle);
	public abstract void tankDrive(double l, double r);
	public abstract void steeringWheelDrive(double forward, double angle);
	public abstract void drive(double speed, double angle);
	@Override
	public void setTurnAngle(double angle) {
		this.angle = angle;
		drive(this.speed, angle);
	}
	@Override
	public void stop()
	{
		this.speed = 0;
		drive(0, this.angle);
	}
	@Override
	public void setMoveSpeed(double speed, Direction direction) {
		switch (direction) {
		case FORWARD:
			speed = Math.abs(speed);
			break;
		case BACKWARD:
			speed = -Math.abs(speed);
			break;
		}
		this.speed = speed;
		drive(speed, this.angle);
	}
}
