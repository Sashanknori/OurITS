package test;

import java.math.BigDecimal;
import java.sql.Date;

import com.ourits.jobcosting.entities.ProjectIdentifier;
import com.ourits.jobcosting.entities.ProjectIdentifierPK;
import com.ourits.jobcosting.persistencehelpers.BasePersistenceHelpers;

public class Test {

	public static void main(String[] args) {
		ProjectIdentifier pi = new ProjectIdentifier();
		ProjectIdentifierPK id = new ProjectIdentifierPK();
		id.setProjectId("111111111");
		id.setProjectName("Ganadhideva");
		pi.setId(id);
		pi.setProjectAmountCurrency("USD");
		pi.setProjectBudgetAmt(new BigDecimal(10000.00));
		pi.setProjectDesc("Jai dussera");
		pi.setProjectEndDate(new Date(0));
		pi.setProjectStrtDate(new Date(0));
		
		BasePersistenceHelpers bph = new BasePersistenceHelpers();
		bph.createProjectIdentifier(pi);

	}

}
