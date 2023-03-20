package Month1_week2.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Driver implements Externalizable {
	int licenceNo;
	String name;
	public Driver(int licenceNo, String name) {
		super();
		this.licenceNo = licenceNo;
		this.name = name;
	}
	public Driver() {
		super();
		System.out.println("Empty Parameter Constructor");
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Driver [licenceNo=");
		builder.append(licenceNo);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		licenceNo = in.readInt();
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(licenceNo);
	}
	
}
