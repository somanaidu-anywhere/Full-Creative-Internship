package Month1_week3.set;

import java.util.Objects;

public class Student implements Comparable {
	private int id;
	private String name;
	private int rank;
	public Student(int id, String name, int rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && rank == other.rank;
	}
	@Override
	public int compareTo(Object o) {
		Student other = (Student)o;
		if(this.rank>other.rank)
			return 1;
		if(this.rank<other.rank)
			return -1;
		if(this.id>other.id)
			return 1;
		if(this.id<other.id)
			return -1;
		return this.name.compareTo(other.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, rank);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(id);
		builder.append("\t");
		builder.append(name);
		builder.append("\t");
		builder.append(rank);
		builder.append("]\n");
		return builder.toString();
	}
}
