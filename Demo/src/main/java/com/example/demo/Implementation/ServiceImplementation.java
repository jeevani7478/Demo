package com.example.demo.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.thymeleaf.standard.expression.Each;

import com.example.demo.bean.Table1Bean;
import com.example.demo.entity.Table1;
import com.example.demo.repository.table1Repository;

@Service
public class ServiceImplementation {
	int Min_mark;
	int Max_mark;
	int avg;

	@Autowired
	table1Repository table1Repo;

	public Table1 SaveDetails(Table1Bean table1Bean) {

		Table1 entity = new Table1();
		try {
			entity.setId(0);
			entity.setName(table1Bean.getName());
			entity.setPassword(table1Bean.getPassword());
			entity.setMin_mark(table1Bean.getMin_mark());
			entity.setMax_mark(table1Bean.getMax_mark());
			// entity.setAvg(table1Bean.getAvg());
			table1Repo.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		return entity;
	}

	public List<Table1Bean> getshowDetails() {

		List<Table1> entitylist1 = new ArrayList<>();

		List<Table1Bean> list = new ArrayList<>();

		try {
			entitylist1 = table1Repo.findAll();
         for(int i=1;i<=entitylist1.size();i++)
         {
			Table1Bean bean = new Table1Bean();
			bean.setName(entitylist1.get(i).getName());
			bean.setPassword(entitylist1.get(i).getPassword());
			bean.setMin_mark(entitylist1.get(i).getMin_mark());
			bean.setMax_mark(entitylist1.get(i).getMax_mark());
			bean.setAvg((entitylist1.get(i).getMin_mark() + entitylist1.get(i).getMax_mark()) / 2);

			list.add(bean);

     }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
}