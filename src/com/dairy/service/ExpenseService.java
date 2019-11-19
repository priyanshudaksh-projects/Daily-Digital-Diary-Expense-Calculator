package com.dairy.service;

import java.util.List;

import com.dairy.pojo.ExpenseDetails;

public interface ExpenseService {
	public int SaveExpense(ExpenseDetails exp);
	public List<ExpenseDetails> FetchExpense(int uid);
}
