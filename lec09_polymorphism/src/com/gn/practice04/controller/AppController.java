package com.gn.practice04.controller;

import com.gn.practice04.model.vo.LoginMenu;
import com.gn.practice04.model.vo.Appfeatures;

public class AppController {
	public void startMyApp() {
		Appfeatures aft = new LoginMenu();
		aft.display(); // 동적 바인딩
		aft.input(); // 동적 바인딩
		aft.close(); // 정적 바인딩
	}
}
