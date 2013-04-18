/*
 * Copyright (C) 2013 SibTelCom, JSC., certain elements licensed under a Contributor Agreement.
 * Author: Konstantin S. Vishnivetsky
 * E-mail: info@siplabs.ru
 * Contributors retain copyright to elements licensed under a Contributor Agreement.
 * Licensed to the User under the LGPL license.
 *
*/

package org.sipfoundry.sipxconfig.phone.3cx;

import java.util.Collection;
import java.util.Iterator;

import org.sipfoundry.sipxconfig.address.Address;
import org.sipfoundry.sipxconfig.address.AddressManager;
import org.sipfoundry.sipxconfig.common.User;
import org.sipfoundry.sipxconfig.device.DeviceDefaults;
import org.sipfoundry.sipxconfig.device.DeviceTimeZone;
import org.sipfoundry.sipxconfig.dns.DnsManager;
import org.sipfoundry.sipxconfig.phonebook.Phonebook;
import org.sipfoundry.sipxconfig.phonebook.PhonebookManager;
import org.sipfoundry.sipxconfig.phonelog.PhoneLog;
import org.sipfoundry.sipxconfig.setting.SettingEntry;

public class 3cxPhoneDefaults {
    private final DeviceDefaults m_defaults;
    private final yealinkPhone m_phone;

    public 3cxPhoneDefaults(DeviceDefaults defaults, yealinkPhone phone) {
        m_defaults = defaults;
        m_phone = phone;
    }

    public String getTFTPServer() {
        Address serverAddress = m_defaults.getTftpServer();
        if (null != serverAddress) {
            return serverAddress.getAddress();
        } else {
            return "";
        }
    }

    @SettingEntry(paths = {
            yealinkConstants.REMOTE_PHONEBOOK_0_URL_SETTING,
            })
    public String getPhonebook0URL() {
        return "tftp://" + getTFTPServer() + "/" + m_phone.getSerialNumber() + "-" + "0" + "-" + yealinkConstants.XML_CONTACT_DATA;
    }

    @SettingEntry(paths = {
            yealinkConstants.AUTOPROVISIONING_SERVER_ADDRESS_SETTING
            })
    public String getserver_address() {
        return  "tftp://" + getTFTPServer();
    }
}

