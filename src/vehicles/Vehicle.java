package vehicles;

public abstract class Vehicle {
	public enum Direction {
		FORWARD, BACKWARD
	};

	private double angle, speed;
	private Direction direction;

	public abstract void setTurnAngle(double angle);

	public abstract void setMoveSpeed(double speed, Direction direction);

	public abstract void stop();

	public void setMoveSpeed(double speed) {
		setMoveSpeed(speed, Direction.FORWARD);
	}

	public void reverseDirection() {
		switch (this.direction) {
		case FORWARD:
			this.direction = Direction.BACKWARD;
			break;
		case BACKWARD:
			this.direction = Direction.FORWARD;
			break;
		}
	}

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	

}