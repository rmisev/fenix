/* This Source Code Form is subject to the terms of the Mozilla Public
   License, v. 2.0. If a copy of the MPL was not distributed with this
   file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fenix.customtabs

import org.mozilla.fenix.HomeActivity

open class CustomTabActivity : HomeActivity() {
    override val isCustomTab = true
}
