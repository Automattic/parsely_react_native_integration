import Foundation
import ParselyAnalytics

// FIXME: Currently just a sample implementation exposing limited methods supporting limited inputs.
//
// We should consider distributing this via NPM with full parameters support.
// See https://reactnative.dev/docs/native-modules-setup
//
// Also to keep in mind that native modules are currently stable, but will be deprecated in "The New Architecture" in favor of:
//
// - https://github.com/reactwg/react-native-new-architecture/blob/main/docs/turbo-modules.md
// - https://github.com/reactwg/react-native-new-architecture/blob/main/docs/fabric-native-components.md

@objc(ParselyNativeModule)
class ParselyNativeModule: NSObject {

  let parsely = Parsely.sharedInstance

  @objc(configureWithSiteId:)
  func configure(siteId: String) {
    parsely.configure(siteId: siteId)
  }

  @objc(startEngagementWithURL:)
  func startEngagement(urlString: String) {
    parsely.startEngagement(url: urlString)
  }

  @objc(trackPageViewWithURL:)
  func trackPageView(urlString: String) {
    parsely.trackPageView(url: urlString)
  }

  @objc(stopEngagement)
  func stopEngagement() {
    parsely.stopEngagement()
  }
}
