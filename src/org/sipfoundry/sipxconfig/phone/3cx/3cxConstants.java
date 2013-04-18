/*
 * Copyright (C) 2013 SibTelCom, JSC., certain elements licensed under a Contributor Agreement.
 * Author: Konstantin S. Vishnivetsky
 * E-mail: info@siplabs.ru
 * Contributors retain copyright to elements licensed under a Contributor Agreement.
 * Licensed to the User under the LGPL license.
 *
*/

package org.sipfoundry.sipxconfig.phone.3cx;

public class 3cxConstants {

    public static final String MIME_TYPE_PLAIN = "text/plain";
    public static final String MIME_TYPE_XML = "text/xml";

    public static final String XML_CONTACT_DATA = "directory.xml";
    public static final String VENDOR = "3CX";

    // Line specific settings used in /etc/yealinkPhone/line.xml
    public static final String USER_ID_V6X_SETTING = "account/UserName";
    public static final String USER_ID_V7X_SETTING = "basic/user_name";
    public static final String AUTH_ID_V6X_SETTING = "account/AuthName";
    public static final String AUTH_ID_V7X_SETTING = "basic/auth_name";
    public static final String DISPLAY_NAME_V6X_SETTING = "account/DisplayName";
    public static final String DISPLAY_NAME_V7X_SETTING = "basic/display_name";
    public static final String PASSWORD_V6X_SETTING = "account/password";
    public static final String PASSWORD_V7X_SETTING = "basic/password";
    public static final String REGISTRATION_SERVER_HOST_V6X_SETTING = "account/SIPServerHost";
    public static final String REGISTRATION_SERVER_HOST_V7X_SETTING = "basic/sip_server_host";
    public static final String REGISTRATION_SERVER_PORT_V6X_SETTING = "account/SIPServerPort";
    public static final String REGISTRATION_SERVER_PORT_V7X_SETTING = "basic/sip_server_port";
    public static final String OUTBOUND_HOST_V6X_SETTING = "account/OutboundHost";
    public static final String OUTBOUND_HOST_V7X_SETTING = "basic/outbound_host";
    public static final String OUTBOUND_PORT_V6X_SETTING = "account/OutboundPort";
    public static final String OUTBOUND_PORT_V7X_SETTING = "basic/outbound_port";
    public static final String BACKUP_OUTBOUND_HOST_V6X_SETTING = "account/BackOutboundHost";
    public static final String BACKUP_OUTBOUND_HOST_V7X_SETTING = "basic/backup_outbound_host";
    public static final String BACKUP_OUTBOUND_PORT_V6X_SETTING = "account/BackOutboundPort";
    public static final String BACKUP_OUTBOUND_PORT_V7X_SETTING = "basic/backup_outbound_port";
    public static final String VOICE_MAIL_NUMBER_V6X_SETTING = "Message/VoiceNumber";
    public static final String VOICE_MAIL_NUMBER_V7X_SETTING = "basic/voice_mail.number";

    // Phone specific settings used in /etc/yealinkPhone/phone.xml
    public static final String DNS_SERVER1_V6X_SETTING = "network-wan/DNS/PrimaryDNS";
    public static final String DNS_SERVER1_V7X_SETTING = "network/network.primary_dns";
    public static final String DNS_SERVER2_V6X_SETTING = "network-wan/DNS/SecondaryDNS";
    public static final String DNS_SERVER2_V7X_SETTING = "network/network.secondary_dns";

    public static final String REMOTE_PHONEBOOK_0_URL_V6X_SETTING = "RemotePhoneBook/0/URL";
    public static final String REMOTE_PHONEBOOK_0_NAME_V6X_SETTING = "RemotePhoneBook/0/Name";
    public static final String AUTOPROVISIONING_SERVER_URL_V6X_SETTING = "upgrade/autoprovision/strServerURL";
}
