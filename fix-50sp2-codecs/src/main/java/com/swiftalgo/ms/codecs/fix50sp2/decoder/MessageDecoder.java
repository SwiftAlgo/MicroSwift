/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import uk.co.real_logic.artio.builder.Decoder;

public interface MessageDecoder extends Decoder
{
    HeaderDecoder header();

    TrailerDecoder trailer();
}