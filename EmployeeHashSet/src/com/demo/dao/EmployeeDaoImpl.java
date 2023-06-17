package com.demo.dao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	public static Set<Employee> eset = new HashSet<>();

	static {
		eset = new HashSet<>();
		eset.add(new Employee(12, "Rajan", "Analyst", 4444));
		eset.add(new Employee(13, "Atharv", "Developer", 5555));
	}

	@Override
	public void save(Employee e) {
		eset.add(e);

	}

	@Override
	public Set<Employee> displayAll() {
		return eset;
	}

	@Override
	public Employee displayById(int id) {
		for (Employee ob : eset) {
			if (ob.getEmpid() == id) {
				return ob;
			}
		}
		return null;
	}

	@Override
	public Set<Employee> displayByName(String nm) {
		Set<Employee> tempname = new HashSet<>();

		for (Employee ob : eset) {
			if (ob.getEname().equals(nm)) {
				tempname.add(ob);
			}
		}
		if (tempname.size() != 0) {
			return tempname;
		}
		return null;
	}

	@Override
	public Set<Employee> sortBySal() {
		Set<Employee> treesal = new TreeSet<>();

		for (Employee ob : eset) {
			treesal.add(ob);
		}
		return treesal;
	}

	@Override
	public Set<Employee> sortByName() {
		Comparator<Employee> c = ((o1, o2) -> {
			return o1.getEname().compareTo(o2.getEname());
		});
		Set<Employee> treeName = new TreeSet<>(c);

		for (Employee ob : eset) {
			treeName.add(ob);
		}

		if (treeName.size() != 0) {
			return treeName;
		}
		return null;
	}

	@Override
	public boolean modifyBySal(int id, double sal) {
		Employee e = displayById(id);
		if (e != null) {
			e.setSal(sal);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		eset.remove(new Employee(id,null,null,0));
		return true;
	}

}
