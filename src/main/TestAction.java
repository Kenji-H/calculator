package main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TestAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		log4jTest();
		
		return null;
	}
	
	/*
	 * test if a generated logger is an instance of Log4JLogger class.
	 */
	private void log4jTest() {
		Log logger = LogFactory.getLog(TestAction.class);
		System.out.println(logger.getClass());
	}

}
