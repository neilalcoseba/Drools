package org.alcoseba.drools;

import org.alcoseba.drools.model.Account;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class App {
	public static void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			// go !
			Account account = new Account(10);
			kSession.insert(account);
			kSession.fireAllRules();
			System.out.println(account.getBalance());
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
