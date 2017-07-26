/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.adapter.server.config;

import com.dell.isg.smi.adapter.server.model.NetworkShare;
import com.dell.isg.smi.adapter.server.model.WsmanCredentials;
import com.dell.isg.smi.wsman.model.XmlConfig;

/**
 * The Interface IConfigAdapter.
 */
public interface IConfigAdapter {

	/**
	 * Configure traps.
	 *
	 * @param credentials
	 *            the credentials
	 * @param targetDestination
	 *            the target destination
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean configureTraps(WsmanCredentials credentials, String targetDestination) throws Exception;

	/**
	 * Update trap format.
	 *
	 * @param credentials
	 *            the credentials
	 * @param snmpTrapFormat
	 *            the snmp trap format
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean updateTrapFormat(WsmanCredentials credentials, String snmpTrapFormat) throws Exception;

	/**
	 * Manage server power.
	 *
	 * @param credentials
	 *            the credentials
	 * @param powerState
	 *            the power state
	 * @return the int
	 * @throws Exception
	 *             the exception
	 */
	public int manageServerPower(WsmanCredentials credentials, String powerState) throws Exception;

	/**
	 * Poll job status.
	 *
	 * @param credentials
	 *            the credentials
	 * @param jobId
	 *            the job id
	 * @param sleepTimeInMillis
	 *            the sleep time in millis
	 * @param retryCount
	 *            the retry count
	 * @return the object
	 * @throws Exception
	 *             the exception
	 */
	public Object pollJobStatus(WsmanCredentials credentials, String jobId, int sleepTimeInMillis, int retryCount)
			throws Exception;

	/**
	 * Reset server.
	 *
	 * @param credentials
	 *            the credentials
	 * @return the int
	 * @throws Exception
	 *             the exception
	 */
	public int resetServer(WsmanCredentials credentials) throws Exception;

	/**
	 * Eject server.
	 *
	 * @param credentials
	 *            the credentials
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean ejectServer(WsmanCredentials credentials) throws Exception;

	/**
	 * Checks if is supported license installed.
	 *
	 * @param credentials
	 *            the credentials
	 * @return true, if is supported license installed
	 * @throws Exception
	 *             the exception
	 */
	public boolean isSupportedLicenseInstalled(WsmanCredentials credentials) throws Exception;

	/**
	 * Export tech support report.
	 *
	 * @param credentials
	 *            the credentials
	 * @param networkShare
	 *            the network share
	 * @return the string
	 * @throws Exception
	 *             the exception
	 */
	public String exportTechSupportReport(WsmanCredentials credentials, NetworkShare networkShare) throws Exception;

	/**
	 * Gets the server trouble shoot mode.
	 *
	 * @param credentials
	 *            the credentials
	 * @return the server trouble shoot mode
	 * @throws Exception
	 *             the exception
	 */
	public String getServerTroubleShootMode(WsmanCredentials credentials) throws Exception;

	/**
	 * Sets the server trouble shoot mode.
	 *
	 * @param credentials
	 *            the credentials
	 * @return the string
	 * @throws Exception
	 *             the exception
	 */
	public String setServerTroubleShootMode(WsmanCredentials credentials) throws Exception;

	/**
	 * Clear server trouble shoot mode.
	 *
	 * @param credentials
	 *            the credentials
	 * @return the string
	 * @throws Exception
	 *             the exception
	 */
	public String clearServerTroubleShootMode(WsmanCredentials credentials) throws Exception;

	/**
	 * Start blink led.
	 *
	 * @param credentials
	 *            the credentials
	 * @param duration
	 *            the duration
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean startBlinkLed(WsmanCredentials credentials, int duration) throws Exception;

	/**
	 * Stop blink led.
	 *
	 * @param credentials
	 *            the credentials
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean stopBlinkLed(WsmanCredentials credentials) throws Exception;

	/**
	 * Export configuration setting.
	 * 
	 * @param wsmanCredentials
	 * @param networkShare
	 * @param components
	 * @param mode
	 * @return
	 * @throws Exception
	 */
	public XmlConfig exportServerConfig(WsmanCredentials wsmanCredentials, NetworkShare networkShare, String components,
			String mode) throws Exception;

	/**
	 * Import configuration setting.
	 * 
	 * configuration import Result.
	 * 
	 * @param wsmanCredentials
	 * @param networkShare
	 * @param shutdownType
	 * @return
	 * @throws Exception
	 */
	public XmlConfig applyServerConfig(WsmanCredentials wsmanCredentials, NetworkShare networkShare, int shutdownType)
			throws Exception;

	/**
	 * Preview configuration import Result.
	 * 
	 * @param wsmanCredentials
	 * @param networkShare
	 * @return
	 * @throws Exception
	 */
	public XmlConfig previewImportServerConfig(WsmanCredentials wsmanCredentials, NetworkShare networkShare)
			throws Exception;

	/**
	 * Get configuration import Result.
	 * 
	 * @param wsmanCredentials
	 * @param jobId
	 * @return
	 * @throws Exception
	 */
	public Object previewConfigResults(WsmanCredentials wsmanCredentials, String jobId) throws Exception;

	/**
	 * Export Hardware Inventory.
	 * 
	 * @param wsmanCredentials
	 * @param networkShare
	 * @return
	 * @throws Exception
	 */
	public XmlConfig exportHardwareInventory(WsmanCredentials wsmanCredentials, NetworkShare networkShare)
			throws Exception;

	/**
	 * Export Factory Setting.
	 * 
	 * @param wsmanCredentials
	 * @param networkShare
	 * @return
	 * @throws Exception
	 */
	public XmlConfig exportFactorySetting(WsmanCredentials wsmanCredentials, NetworkShare networkShare)
			throws Exception;
}