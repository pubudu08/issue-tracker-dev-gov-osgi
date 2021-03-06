package org.wso2.carbon.utility.issuetracker;

import org.wso2.carbon.utility.issuetracker.exception.GenericArtifactException;

/**
 * IssueTrackerArtifact is an interface for all Issue tracker related APIs
 * this will act as a pluggable api interface.
 *
 * @author Pubudu Dissanayake : pubudud@wso2.com on 02/02/2014.
 */
public interface IssueTrackerArtifact {

	/**
	 * This method will returns artifact type
	 *
	 * @return <code>its</code>
	 */
	public String getIssueTrackerType();

	/**
	 * This method will create a project which is related to iss
	 *
	 * @param username    valid username to access api
	 * @param password    valid password to access api
	 * @param projectKey  shorten name of the project
	 * @param name        name of the project
	 * @param description description fo the project
	 * @param url         optional field : provide url for the project
	 * @param lead        required field : lead of the project
	 * @return <code>true</code> if project get successfully created
	 */
	public void createIssueTrackerProject(String username,
	                                      String password,
	                                      String projectKey,
	                                      String name,
	                                      String description,
	                                      String url,
	                                      String lead) throws GenericArtifactException;
}
