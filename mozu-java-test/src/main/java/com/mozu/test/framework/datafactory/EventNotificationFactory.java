/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.event.EventNotificationResource;

/** <summary>
 * Events are notifications Mozu publishes to the application when a create, read, update, or delete operation is performed. If the application subscribes to the event, you can use the Events resource to query for recent events Mozu published to your application or events that were not published successfully.
 * </summary>
 */
public class EventNotificationFactory
{

	public static com.mozu.api.contracts.event.EventCollection getEvents(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getEvents(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.event.EventCollection getEvents(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.event.EventCollection returnObj = new com.mozu.api.contracts.event.EventCollection();
		EventNotificationResource resource = new EventNotificationResource(apiContext);
		try
		{
			returnObj = resource.getEvents( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.event.Event getEvent(ApiContext apiContext, String eventId, int expectedCode) throws Exception
	{
		return getEvent(apiContext,  eventId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.event.Event getEvent(ApiContext apiContext, String eventId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.event.Event returnObj = new com.mozu.api.contracts.event.Event();
		EventNotificationResource resource = new EventNotificationResource(apiContext);
		try
		{
			returnObj = resource.getEvent( eventId,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

}



