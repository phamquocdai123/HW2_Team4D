<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GetUserCommunity</name>
   <tag></tag>
   <elementGuidId>01088fc9-32aa-41b5-a2e7-6b73459c215a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;operationName\&quot;:\&quot;getCurrentUserCommunityConnection\&quot;,\n  \&quot;variables\&quot;:{},\n  \&quot;query\&quot;:\&quot;query getCurrentUserCommunityConnection {\\n  user: currentUser {\\n    ...userInfo\\n    ...userCommunityConnection\\n    __typename\\n  }\\n}\\n\\nfragment userInfo on User {\\n  id\\n  profilePhoto\\n  coverPhoto\\n  name\\n  firstName\\n  description\\n  website\\n  username\\n  isOnline\\n  timezone\\n  totalReputation\\n  betaSupporter\\n  __typename\\n}\\n\\nfragment userCommunityConnection on User {\\n  communityConnection {\\n    pageInfo {\\n      hasNextPage\\n      hasPreviousPage\\n      __typename\\n    }\\n    edges {\\n      node {\\n        ...communityInfo\\n        ...communityMetaData\\n        contextPermissions {\\n          communityId\\n          isOwner\\n          isModerator\\n          reputation\\n          __typename\\n        }\\n        __typename\\n      }\\n      __typename\\n    }\\n    __typename\\n  }\\n  __typename\\n}\\n\\nfragment communityMetaData on Community {\\n  metaData {\\n    members\\n    onlineMembers\\n    __typename\\n  }\\n  __typename\\n}\\n\\nfragment communityInfo on Community {\\n  id\\n  createdAt\\n  name\\n  slug\\n  description\\n  website\\n  profilePhoto\\n  coverPhoto\\n  pinnedThreadId\\n  isPrivate\\n  watercoolerId\\n  lastActive\\n  communityPermissions {\\n    isMember\\n    isBlocked\\n    isOwner\\n    isPending\\n    isModerator\\n    reputation\\n    lastSeen\\n    __typename\\n  }\\n  brandedLogin {\\n    isEnabled\\n    message\\n    __typename\\n  }\\n  __typename\\n}\\n\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cookie</name>
      <type>Main</type>
      <value>${cook}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://localhost:3001/api</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
