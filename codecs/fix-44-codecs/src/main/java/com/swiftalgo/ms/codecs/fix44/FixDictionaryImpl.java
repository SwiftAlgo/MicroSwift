/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.FixDictionary;
import uk.co.real_logic.artio.builder.AbstractLogonEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.LogonEncoder;
import uk.co.real_logic.artio.builder.AbstractResendRequestEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.ResendRequestEncoder;
import uk.co.real_logic.artio.builder.AbstractLogoutEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.LogoutEncoder;
import uk.co.real_logic.artio.builder.AbstractHeartbeatEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.HeartbeatEncoder;
import uk.co.real_logic.artio.builder.AbstractRejectEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.RejectEncoder;
import uk.co.real_logic.artio.builder.AbstractTestRequestEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.TestRequestEncoder;
import uk.co.real_logic.artio.builder.AbstractSequenceResetEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.SequenceResetEncoder;
import uk.co.real_logic.artio.builder.AbstractBusinessMessageRejectEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.BusinessMessageRejectEncoder;
import uk.co.real_logic.artio.builder.SessionHeaderEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.HeaderEncoder;
import uk.co.real_logic.artio.decoder.AbstractLogonDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.LogonDecoder;
import uk.co.real_logic.artio.decoder.AbstractLogoutDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.LogoutDecoder;
import uk.co.real_logic.artio.decoder.AbstractRejectDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.RejectDecoder;
import uk.co.real_logic.artio.decoder.AbstractTestRequestDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.TestRequestDecoder;
import uk.co.real_logic.artio.decoder.AbstractSequenceResetDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.SequenceResetDecoder;
import uk.co.real_logic.artio.decoder.AbstractHeartbeatDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.HeartbeatDecoder;
import uk.co.real_logic.artio.decoder.AbstractResendRequestDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.ResendRequestDecoder;
import uk.co.real_logic.artio.decoder.AbstractUserRequestDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.UserRequestDecoder;
import uk.co.real_logic.artio.decoder.SessionHeaderDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.HeaderDecoder;
public class FixDictionaryImpl implements FixDictionary
{
    public String beginString()
    {
        return "FIX.4.4";
    }

    public SessionHeaderDecoder makeHeaderDecoder()
    {
        return new HeaderDecoder();
    }

    public SessionHeaderEncoder makeHeaderEncoder()
    {
        return new HeaderEncoder();
    }

    public AbstractLogonEncoder makeLogonEncoder()
    {
        return new LogonEncoder();
    }

    public AbstractResendRequestEncoder makeResendRequestEncoder()
    {
        return new ResendRequestEncoder();
    }

    public AbstractLogoutEncoder makeLogoutEncoder()
    {
        return new LogoutEncoder();
    }

    public AbstractHeartbeatEncoder makeHeartbeatEncoder()
    {
        return new HeartbeatEncoder();
    }

    public AbstractRejectEncoder makeRejectEncoder()
    {
        return new RejectEncoder();
    }

    public AbstractTestRequestEncoder makeTestRequestEncoder()
    {
        return new TestRequestEncoder();
    }

    public AbstractSequenceResetEncoder makeSequenceResetEncoder()
    {
        return new SequenceResetEncoder();
    }

    public AbstractBusinessMessageRejectEncoder makeBusinessMessageRejectEncoder()
    {
        return new BusinessMessageRejectEncoder();
    }

    public AbstractLogonDecoder makeLogonDecoder()
    {
        return new LogonDecoder();
    }

    public AbstractLogoutDecoder makeLogoutDecoder()
    {
        return new LogoutDecoder();
    }

    public AbstractRejectDecoder makeRejectDecoder()
    {
        return new RejectDecoder();
    }

    public AbstractTestRequestDecoder makeTestRequestDecoder()
    {
        return new TestRequestDecoder();
    }

    public AbstractSequenceResetDecoder makeSequenceResetDecoder()
    {
        return new SequenceResetDecoder();
    }

    public AbstractHeartbeatDecoder makeHeartbeatDecoder()
    {
        return new HeartbeatDecoder();
    }

    public AbstractResendRequestDecoder makeResendRequestDecoder()
    {
        return new ResendRequestDecoder();
    }

    public AbstractUserRequestDecoder makeUserRequestDecoder()
    {
        return new UserRequestDecoder();
    }

}
