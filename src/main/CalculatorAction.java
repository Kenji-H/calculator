package main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import main.NumberForm;

public class CalculatorAction extends DispatchAction {
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		NumberForm f = (NumberForm) form;
		int x = f.getX();
		int y = f.getY();
		int ans = x + y;
		f.setAns(ans);

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

		return mapping.findForward("output");
	}

	public ActionForward devide(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		NumberForm f = (NumberForm) form;
		int x = f.getX();
		int y = f.getY();
		int ans = x / y;
		f.setAns(ans);

		return mapping.findForward("output");
	}
}
