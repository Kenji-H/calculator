package main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import main.NumberForm;

public class CalculatorAction extends DispatchAction {
	private static Log logger = LogFactory.getLog(CalculatorAction.class);
	
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		NumberForm f = (NumberForm) form;
		int x = f.getX();
		int y = f.getY();
		int ans = x + y;
		f.setAns(ans);

		logger.info("addition: " + x + " + " + y + " = " + ans);

		return mapping.findForward("output");
	}

	public ActionForward subtract(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		NumberForm f = (NumberForm) form;
		int x = f.getX();
		int y = f.getY();
		int ans = x - y;
		f.setAns(ans);

		logger.info("subtraction: " + x + " - " + y + " = " + ans);

		return mapping.findForward("output");
	}

	public ActionForward multiply(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		NumberForm f = (NumberForm) form;
		int x = f.getX();
		int y = f.getY();
		int ans = x * y;
		f.setAns(ans);

		logger.info("multiplication: " + x + " * " + y + " = " + ans);
		
		return mapping.findForward("output");
	}

	public ActionForward divide(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		NumberForm f = (NumberForm) form;
		int x = f.getX();
		int y = f.getY();
		int ans = 0;
		try {
			ans = x / y;
		} catch (ArithmeticException e) {
			logger.error(e.getMessage());
		}
		f.setAns(ans);

		logger.info("division: " + x + " / " + y + " = " + ans);

		return mapping.findForward("output");
	}
}
