package org.jenkins;

import org.jenkins.model.Personne;

public class MainTest {

	public static void main(String[] args) {
		Personne p = new Personne("Jb");
		System.out.println(p.getName());
	}

}
