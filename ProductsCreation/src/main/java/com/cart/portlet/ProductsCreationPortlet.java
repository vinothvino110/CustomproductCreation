package com.cart.portlet;

import com.cart.constants.ProductsCreationPortletKeys;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author vinoth.l
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ProductsCreation",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ProductsCreationPortletKeys.PRODUCTSCREATION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProductsCreationPortlet extends MVCPortlet {
	
	public void formsubmit(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		System.out.println("process action working...");
		String cupid=ParamUtil.getString(actionRequest,"cupid");
		String pname=ParamUtil.getString(actionRequest,"pname");
		String ptype=ParamUtil.getString(actionRequest,"ptype");
		String pprice=ParamUtil.getString(actionRequest,"pprice");
		String pbrand=ParamUtil.getString(actionRequest,"pbrand");
		
		System.out.println("process action product data"+ cupid + pname+ ptype + pprice + pbrand);
		System.out.println("Test01");
		System.out.println("Test02");
		System.out.println("Test03");
		//String cupidst= Integer.parseInt()
		
		JSONObject jsonObject =  JSONFactoryUtil.createJSONObject();
		jsonObject.put("cupid", cupid);
		jsonObject.put("pname", pname);
		jsonObject.put("ptype", ptype);
		jsonObject.put("pprice", pprice);
		jsonObject.put("pbrand", pbrand);
		System.out.println("jsonObject" + jsonObject);
		actionRequest.setAttribute("data", jsonObject);
				
	}
}