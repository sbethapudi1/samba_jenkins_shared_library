def call(String projectname)
{
	if (projectname == "WESUTILS")
	{
	def RESET_REL_VERSION= datas.compile.RESET_REL_VERSION
	sh """
		#!/bin/sh
		if [ ! -Z "SRESET_REL_VERSION" ]
		then
		echo "In the IF Section"
		sed -i "s\\(^PACKAGE_RELEASE=\\V).*\\1\$RESET_REL_VERSION/" /root/version_enabler.txt;
		sed -i "s\\(^PKG_RELEASE=\\)./\\1\$RESET_REL_VERSION/" \${WORKSPACE }/WESUTILS/INFO ;
		sed -i "s/ (^PKG_RELEASE=\\)./\\1\$RESET_REL_VERSION/" \$(WORKSPACE}/WESUTILS_PACKAGES/INFO
		else
		/root/version_enabler.txt
		echo "Now Sourcing PACKAGE_RELEASE number"
		echo "Package release version before increnting is PACKAGE_RELEASE"
		varInca'expr \$PACKAGE RELEASE + 01
		echo "Package release version is \$varInc"
		sed -i "s\\(PACKAGE_RELEASE-11). */\\1\$varinc/" /root/version_enabler.txt;
		sed -i "s\\(APKG_RELEASE=\\).*/\\1\$varinc/" \${WORKSPACE}/WESUTILS/INFO ;
		sed -i "s/(PKG_RELEASE=\\).*/\\1\$varinc/" \${WORKSPACE}/WESUTILS_PACKAGES/INFO;
		echo "\$varInc"> /root/env_version.txt
		fi
	"""
   }
}