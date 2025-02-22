/**
 * Generated by typeshare 1.0.0
 */

@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

@Serializable
class OtherType

/// This is a comment.
@Serializable
data class PersonTwo (
	var name: String,
	var age: UByte,
	var extraSpecialFieldOne: Int,
	var extraSpecialFieldTwo: List<String>? = null,
	var nonStandardDataType: OtherType,
	var nonStandardDataTypeInArray: List<OtherType>? = null
)

